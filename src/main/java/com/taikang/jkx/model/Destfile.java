package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Destfile implements Serializable {
    private Integer id;

    private String dstFileName;

    private Integer x;

    private Integer y;

    private String filename;

    private Integer sourceR;

    private Integer sourceG;

    private Integer sourceB;

    private Integer fileR;

    private Integer fileG;

    private Integer fileB;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDstFileName() {
        return dstFileName;
    }

    public void setDstFileName(String dstFileName) {
        this.dstFileName = dstFileName;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getSourceR() {
        return sourceR;
    }

    public void setSourceR(Integer sourceR) {
        this.sourceR = sourceR;
    }

    public Integer getSourceG() {
        return sourceG;
    }

    public void setSourceG(Integer sourceG) {
        this.sourceG = sourceG;
    }

    public Integer getSourceB() {
        return sourceB;
    }

    public void setSourceB(Integer sourceB) {
        this.sourceB = sourceB;
    }

    public Integer getFileR() {
        return fileR;
    }

    public void setFileR(Integer fileR) {
        this.fileR = fileR;
    }

    public Integer getFileG() {
        return fileG;
    }

    public void setFileG(Integer fileG) {
        this.fileG = fileG;
    }

    public Integer getFileB() {
        return fileB;
    }

    public void setFileB(Integer fileB) {
        this.fileB = fileB;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Destfile other = (Destfile) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDstFileName() == null ? other.getDstFileName() == null : this.getDstFileName().equals(other.getDstFileName()))
            && (this.getX() == null ? other.getX() == null : this.getX().equals(other.getX()))
            && (this.getY() == null ? other.getY() == null : this.getY().equals(other.getY()))
            && (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getSourceR() == null ? other.getSourceR() == null : this.getSourceR().equals(other.getSourceR()))
            && (this.getSourceG() == null ? other.getSourceG() == null : this.getSourceG().equals(other.getSourceG()))
            && (this.getSourceB() == null ? other.getSourceB() == null : this.getSourceB().equals(other.getSourceB()))
            && (this.getFileR() == null ? other.getFileR() == null : this.getFileR().equals(other.getFileR()))
            && (this.getFileG() == null ? other.getFileG() == null : this.getFileG().equals(other.getFileG()))
            && (this.getFileB() == null ? other.getFileB() == null : this.getFileB().equals(other.getFileB()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDstFileName() == null) ? 0 : getDstFileName().hashCode());
        result = prime * result + ((getX() == null) ? 0 : getX().hashCode());
        result = prime * result + ((getY() == null) ? 0 : getY().hashCode());
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getSourceR() == null) ? 0 : getSourceR().hashCode());
        result = prime * result + ((getSourceG() == null) ? 0 : getSourceG().hashCode());
        result = prime * result + ((getSourceB() == null) ? 0 : getSourceB().hashCode());
        result = prime * result + ((getFileR() == null) ? 0 : getFileR().hashCode());
        result = prime * result + ((getFileG() == null) ? 0 : getFileG().hashCode());
        result = prime * result + ((getFileB() == null) ? 0 : getFileB().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dstFileName=").append(dstFileName);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", filename=").append(filename);
        sb.append(", sourceR=").append(sourceR);
        sb.append(", sourceG=").append(sourceG);
        sb.append(", sourceB=").append(sourceB);
        sb.append(", fileR=").append(fileR);
        sb.append(", fileG=").append(fileG);
        sb.append(", fileB=").append(fileB);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}