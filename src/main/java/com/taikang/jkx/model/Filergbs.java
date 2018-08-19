package com.taikang.jkx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Filergbs implements Serializable {
    private String filename;

    private Integer r;

    private Integer g;

    private Integer b;

    private static final long serialVersionUID = 1L;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
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
        Filergbs other = (Filergbs) that;
        return (this.getFilename() == null ? other.getFilename() == null : this.getFilename().equals(other.getFilename()))
            && (this.getR() == null ? other.getR() == null : this.getR().equals(other.getR()))
            && (this.getG() == null ? other.getG() == null : this.getG().equals(other.getG()))
            && (this.getB() == null ? other.getB() == null : this.getB().equals(other.getB()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
        result = prime * result + ((getR() == null) ? 0 : getR().hashCode());
        result = prime * result + ((getG() == null) ? 0 : getG().hashCode());
        result = prime * result + ((getB() == null) ? 0 : getB().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", filename=").append(filename);
        sb.append(", r=").append(r);
        sb.append(", g=").append(g);
        sb.append(", b=").append(b);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}