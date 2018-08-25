package com.taikang.jkx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.shiro.util.CollectionUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.taikang.jkx.mapper.DestfileMapper;
import com.taikang.jkx.mapper.FilergbsMapper;
import com.taikang.jkx.model.Destfile;
import com.taikang.jkx.model.DestfileExample;
import com.taikang.jkx.model.DestfileExample.Criteria;
import com.taikang.jkx.model.Filergbs;
import com.taikang.jkx.model.FilergbsExample;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplition.class)
public class PictureGenerator {

	@Autowired
	private FilergbsMapper filergbsMapper;
	@Autowired
	private DestfileMapper destfileMapper;

	/**
	 * 批量对图片进行重命名
	 */
	@Test
	public void fun1() {
		File files = new File("D:/smallPic");
		File dstFiles = new File("D:/smallPic/dst");
		if (!dstFiles.exists()) {
			dstFiles.mkdir();
		}
		if (files.exists() && files.isDirectory()) {
			File[] listFiles = files.listFiles();
			if (listFiles.length > 0) {
				int count = 1;
				for (File file : listFiles) {
					if(file.isFile()){
						file.renameTo(new File(dstFiles, count + ".jpg"));
						count++;
					}
				}
			}
		}
	}

	/**
	 * 对源素材图片进行重命名
	 * 
	 * @param sourceDirectory
	 * @param renameDirectory
	 */
	public void renamePicture(File sourceDirectory, File renameDirectory) {
		if (!renameDirectory.exists()) {
			renameDirectory.mkdir();
		}
		if (sourceDirectory.exists() && sourceDirectory.isDirectory()) {
			File[] listFiles = sourceDirectory.listFiles();
			if (listFiles.length > 0) {
				int count = 1;
				for (File file : listFiles) {
					if(file.isFile()){
						String[] split = file.getName().split("\\.");
						String string = split[split.length-1];
						file.renameTo(new File(renameDirectory, count +"."+ string));
						count++;
					}
				}
			}
		}
	}

	/**
	 * 批量修剪图片为正方形
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun2() throws IOException {
		File source = new File("D:/smallPic/dst");
		File dstFiles = new File("D:/smallPic/fang");
		if (!dstFiles.exists()) {
			dstFiles.mkdir();
		}
		if (source.exists() && source.isDirectory()) {
			File[] listFiles = source.listFiles();
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						BufferedImage read = ImageIO.read(file);
						int height = read.getHeight();
						int width = read.getWidth();
						if (height > width) {
							BufferedImage bi = new BufferedImage(width, width, BufferedImage.TYPE_INT_RGB);
							Graphics g = bi.getGraphics();
							g.drawImage(read, 0, 0, width, width, Color.LIGHT_GRAY, null);
							g.dispose();
							ImageIO.write(bi, "jpg", new File(dstFiles, file.getName()));
						} else {
							BufferedImage bi = new BufferedImage(height, height, BufferedImage.TYPE_INT_RGB);
							Graphics g = bi.getGraphics();
							g.drawImage(read, 0, 0, height, height, Color.LIGHT_GRAY, null);
							g.dispose();
							ImageIO.write(bi, "jpg", new File(dstFiles, file.getName()));
						}
					}
				}
			}
		}
	}

	public void xiujian(File renameDirectory, File fangDirectory) throws IOException {
		if (!fangDirectory.exists()) {
			fangDirectory.mkdir();
		}
		if (renameDirectory.exists() && renameDirectory.isDirectory()) {
			File[] listFiles = renameDirectory.listFiles();
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						System.out.println(file.getName());
						BufferedImage read = ImageIO.read(file);
						int height = read.getHeight();
						int width = read.getWidth();
						if (height > width) {
							BufferedImage bi = new BufferedImage(width, width, BufferedImage.TYPE_INT_RGB);
							Graphics g = bi.getGraphics();
							g.drawImage(read, 0, 0, width, width, Color.LIGHT_GRAY, null);
							g.dispose();
							ImageIO.write(bi, "jpg", new File(fangDirectory, file.getName()));
						} else {
							BufferedImage bi = new BufferedImage(height, height, BufferedImage.TYPE_INT_RGB);
							Graphics g = bi.getGraphics();
							g.drawImage(read, 0, 0, height, height, Color.LIGHT_GRAY, null);
							g.dispose();
							ImageIO.write(bi, "jpg", new File(fangDirectory, file.getName()));
						}
					}
				}
			}
		}
	}

	/**
	 * 计算图片的平均rgb值
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun3() throws IOException {
		File source = new File("D:/smallPic/fang");
		if (source.exists() && source.isDirectory()) {
			File[] listFiles = source.listFiles();
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						BufferedImage read = ImageIO.read(file);
						int height = read.getHeight();
						int width = read.getWidth();
						int red = 0;
						int green = 0;
						int blue = 0;
						int[] rgbs = new int[3];
						for (int i = 0; i < width; i++) {
							for (int j = 0; j < height; j++) {
								int rgb = read.getRGB(i, j);
								rgbs[0] = (rgb & 0xff0000) >> 16;
							rgbs[1] = (rgb & 0xff00) >> 8;
							rgbs[2] = (rgb & 0xff);
							red += rgbs[0];
							green += rgbs[1];
							blue += rgbs[2];
							}
						}
						int r = width * height;
						int red1 = red / r;
						int green1 = green / r;
						int blue1 = blue / r;
						Filergbs rgb = new Filergbs();
						rgb.setFilename(file.getName());
						rgb.setR(red1);
						rgb.setG(green1);
						rgb.setB(blue1);
						filergbsMapper.insert(rgb);
					}
				}
			}
		}
	}

	public void countRgb(File fangDirectory) throws IOException {
		if (fangDirectory.exists() && fangDirectory.isDirectory()) {
			File[] listFiles = fangDirectory.listFiles();
			FilergbsExample example = new FilergbsExample(); 
			filergbsMapper.deleteByExample(example);
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						BufferedImage read = ImageIO.read(file);
						int height = read.getHeight();
						int width = read.getWidth();
						int red = 0;
						int green = 0;
						int blue = 0;
						int[] rgbs = new int[3];
						for (int i = 0; i < width; i++) {
							for (int j = 0; j < height; j++) {
								int rgb = read.getRGB(i, j);
								rgbs[0] = (rgb & 0xff0000) >> 16;
							rgbs[1] = (rgb & 0xff00) >> 8;
							rgbs[2] = (rgb & 0xff);
							red += rgbs[0];
							green += rgbs[1];
							blue += rgbs[2];
							}
						}
						int r = width * height;
						int red1 = red / r;
						int green1 = green / r;
						int blue1 = blue / r;
						Filergbs rgb = new Filergbs();
						rgb.setFilename(file.getName());
						rgb.setR(red1);
						rgb.setG(green1);
						rgb.setB(blue1);
						filergbsMapper.insert(rgb);
					}
				}
			}
		}
	}

	/**
	 * 比较每个像素和图片资源之间的距离
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun4() throws IOException {
		FilergbsExample example = new FilergbsExample();
		List<Filergbs> selectByExample = filergbsMapper.selectByExample(example);
		File liudehua = new File("D:/luidehua.jpg");
		BufferedImage read = ImageIO.read(liudehua);
		int height = read.getHeight();
		int width = read.getWidth();
		double smallestSpaceLength = -1;
		Map<Integer,Filergbs> smallestSpace = new HashMap<>();
		Filergbs smallestSpaceFile = null;
		long start = System.currentTimeMillis();
		System.out.println(start);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int[] rgb = new int[3];
				int pixel = read.getRGB(i, j);
				rgb[0] = (pixel & 0xff0000) >> 16;
				rgb[1] = (pixel & 0xff00) >> 8;
				rgb[2] = (pixel & 0xff);
				for (Filergbs fileRgb : selectByExample) {
					double space = (float) (Math.pow((rgb[0] - fileRgb.getR()), 2)
							+ Math.pow((rgb[1] - fileRgb.getG()), 2) + Math.pow((rgb[2] - fileRgb.getB()), 2));
					double spacelength = Math.sqrt(space);
					smallestSpace.put((int)spacelength, fileRgb);
//					if (smallestSpaceLength < 0 || smallestSpaceLength > spacelength) {
//						smallestSpaceLength = spacelength;
//						smallestSpaceFile = fileRgb;
//					}
				}
				
				//从色彩空间中距离最近的5个图片中随机抽一个图片.
				Random random = new Random();
				int nextInt = random.nextInt(5);
				Set<Entry<Integer,Filergbs>> entrySet = smallestSpace.entrySet();
				int count = 0;
				for (Entry<Integer, Filergbs> entry : entrySet) {
					if(count == nextInt){
						smallestSpaceFile = entry.getValue();
						break;
					}
					count++;
				}
				
				Destfile destFile = new Destfile();
				destFile.setDstFileName(liudehua.getName());
				destFile.setSourceR(rgb[0]);
				destFile.setSourceG(rgb[1]);
				destFile.setSourceB(rgb[2]);
				destFile.setX(i);
				destFile.setY(j);
				destFile.setFilename(smallestSpaceFile.getFilename());
				destFile.setFileR(smallestSpaceFile.getR());
				destFile.setFileG(smallestSpaceFile.getG());
				destFile.setFileB(smallestSpaceFile.getB());
				System.out.println(i + "_" + j + "smallestSpaceLength:" + smallestSpaceLength);
				destfileMapper.insert(destFile);
				smallestSpaceLength = -1;
				smallestSpaceFile = null;
				smallestSpace.clear();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("共用时:" + (end - start) / 1000 + "s");
	}
	
	public void compareSpace(File sourceFile) throws IOException{
		DestfileExample example_ = new DestfileExample();
		destfileMapper.deleteByExample(example_);
		FilergbsExample example = new FilergbsExample();
		List<Filergbs> selectByExample = filergbsMapper.selectByExample(example);
		BufferedImage read = ImageIO.read(sourceFile);
		int height = read.getHeight();
		int width = read.getWidth();
		double smallestSpaceLength = -1;
		Map<Integer,Filergbs> smallestSpace = new HashMap<>();
		Filergbs smallestSpaceFile = null;
		long start = System.currentTimeMillis();
		System.out.println(start);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				int[] rgb = new int[3];
				int pixel = read.getRGB(i, j);
				rgb[0] = (pixel & 0xff0000) >> 16;
				rgb[1] = (pixel & 0xff00) >> 8;
				rgb[2] = (pixel & 0xff);
				for (Filergbs fileRgb : selectByExample) {
					double space = (float) (Math.pow((rgb[0] - fileRgb.getR()), 2)
							+ Math.pow((rgb[1] - fileRgb.getG()), 2) + Math.pow((rgb[2] - fileRgb.getB()), 2));
					double spacelength = Math.sqrt(space);
					smallestSpace.put((int)spacelength, fileRgb);
				}
				//从色彩空间中距离最近的5个图片中随机抽一个图片.
				Random random = new Random();
				int nextInt = random.nextInt(5);
				Set<Entry<Integer,Filergbs>> entrySet = smallestSpace.entrySet();
				int count = 0;
				for (Entry<Integer, Filergbs> entry : entrySet) {
					if(count == nextInt){
						smallestSpaceFile = entry.getValue();
						break;
					}
					count++;
				}
				
				Destfile smallestSpaceFiles = new Destfile();
				smallestSpaceFiles.setDstFileName(sourceFile.getName());
				smallestSpaceFiles.setSourceR(rgb[0]);
				smallestSpaceFiles.setSourceG(rgb[1]);
				smallestSpaceFiles.setSourceB(rgb[2]);
				smallestSpaceFiles.setX(i);
				smallestSpaceFiles.setY(j);
				smallestSpaceFiles.setFilename(smallestSpaceFile.getFilename());
				smallestSpaceFiles.setFileR(smallestSpaceFile.getR());
				smallestSpaceFiles.setFileG(smallestSpaceFile.getG());
				smallestSpaceFiles.setFileB(smallestSpaceFile.getB());
				System.out.println(i + "_" + j + "smallestSpaceLength:" + smallestSpaceLength);
				destfileMapper.insert(smallestSpaceFiles);
				smallestSpaceLength = -1;
				smallestSpaceFile = null;
				smallestSpace.clear();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("共用时:" + (end - start) / 1000 + "s");
	}

	/**
	 * 将图片资源统一裁剪成指定大小的图片
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun5() throws IOException {
		File source = new File("D:/smallPic/fang");
		File biaozhundaxiao = new File("D:/smallPic/tongyidaxiao");
		if (!biaozhundaxiao.exists()) {
			biaozhundaxiao.mkdir();
		}
		if (source.exists() && source.isDirectory()) {
			File[] listFiles = source.listFiles();
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						BufferedImage read = ImageIO.read(file);
						BufferedImage bi = new BufferedImage(50, 50, BufferedImage.TYPE_INT_RGB);
						float rate = read.getHeight() / 50;
						for (int i = 0; i < 50; i++) {
							for (int j = 0; j < 50; j++) {
								int rgb = read.getRGB((int) (i * rate), (int) (j * rate));
								bi.setRGB(i, j, rgb);
							}
						}
						bi.flush();
						ImageIO.write(bi, "jpg", new File(biaozhundaxiao, file.getName()));
					}
				}
			}
		}
	}
	
	public void resizePicture(File fangDirectory,File resizeDirectory) throws IOException {
		if (!resizeDirectory.exists()) {
			resizeDirectory.mkdir();
		}
		if (fangDirectory.exists() && fangDirectory.isDirectory()) {
			File[] listFiles = fangDirectory.listFiles();
			if (listFiles.length > 0) {
				for (File file : listFiles) {
					if(file.isFile()){
						BufferedImage read = ImageIO.read(file);
						BufferedImage bi = new BufferedImage(150, 150, BufferedImage.TYPE_INT_RGB);
						float rate = read.getHeight() / 150;
						for (int i = 0; i < 150; i++) {
							for (int j = 0; j < 150; j++) {
								int rgb = read.getRGB((int) (i * rate), (int) (j * rate));
								bi.setRGB(i, j, rgb);
							}
						}
						bi.flush();
						ImageIO.write(bi, "jpg", new File(resizeDirectory, file.getName()));
					}
				}
			}
		}
	}

	/**
	 * 拼接图片
	 * 
	 * @throws IOException
	 */
	@Test
	public void fun6() throws IOException {
		File biaozhundaxiao = new File("D:/smallPic/tongyidaxiao");
		BufferedImage bi = new BufferedImage(2500, 3400, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bi.getGraphics();
		DestfileExample example = new DestfileExample();
		Criteria criteria = example.createCriteria();
		criteria.andDstFileNameEqualTo("luidehua.jpg");
		List<Destfile> selectByExample = destfileMapper.selectByExample(example);
		if (!CollectionUtils.isEmpty(selectByExample)) {
			for (Destfile destfile : selectByExample) {
				String filename = destfile.getFilename();
				Integer x = destfile.getX();
				Integer y = destfile.getY();
				File waitPinjieFile = new File(biaozhundaxiao, filename);
				BufferedImage read = ImageIO.read(waitPinjieFile);
				graphics.drawImage(read, x * 50, y * 50, 50, 50, Color.LIGHT_GRAY, null);
			}
			ImageIO.write(bi, "jpg", new File("D:/zuizhongjieguo.jpg"));
		}
	}

	/**
	 * 拼接图片
	 * 
	 * @param biaozhundaxiao_
	 * @param sourceFileName
	 * @param destFile
	 * @throws IOException
	 */
	public void pinjie(File resizeDirectory, String sourceFileName, File destFile ,File sourceFile) throws IOException {
		BufferedImage read2 = ImageIO.read(sourceFile);
		int height = read2.getHeight();
		int width = read2.getWidth();
		BufferedImage bi = new BufferedImage(width*150, height*150, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = bi.getGraphics();
		DestfileExample example = new DestfileExample();
		Criteria criteria = example.createCriteria();
		criteria.andDstFileNameEqualTo(sourceFileName);
		List<Destfile> selectByExample = destfileMapper.selectByExample(example);
		if (!CollectionUtils.isEmpty(selectByExample)) {
			for (Destfile destfile : selectByExample) {
				String filename = destfile.getFilename();
				Integer x = destfile.getX();
				Integer y = destfile.getY();
				File waitPinjieFile = new File(resizeDirectory, filename);
				BufferedImage read = ImageIO.read(waitPinjieFile);
				graphics.drawImage(read, x * 150, y * 150, 150, 150, Color.LIGHT_GRAY, null);
			}
			ImageIO.write(bi, "jpg", destFile);
		}
	}
	
	/**
	 * 整合流程
	 * @throws IOException 
	 */
	@Test
	public void fun7() throws IOException{
		File sourceFile = new File("D:/maobuyi.jpeg");
		File destFile = new File("D:/maobuyiDest.jpg");
		File sourceDirectory = new File("D:/maobuyi");
		File renameDirectory = new File(sourceDirectory,"rename");
		File fangDirectory = new File(sourceDirectory,"fang");
		File resizeDirectory = new File(sourceDirectory,"resize");
//		renamePicture(sourceDirectory, renameDirectory);
//		xiujian(renameDirectory, fangDirectory );
//		countRgb(fangDirectory);
		compareSpace(sourceFile);
		resizePicture(fangDirectory,resizeDirectory);
		pinjie(resizeDirectory, sourceFile.getName(), destFile,sourceFile);
	}

}
