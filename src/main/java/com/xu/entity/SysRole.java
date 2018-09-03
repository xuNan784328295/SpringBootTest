package com.xu.entity;

public class SysRole {
    private int ng_id;
    private String sz_name;
    private int ng_creator;
    private long ts_create;

    public int getNg_id() {
        return ng_id;
    }

    public void setNg_id(int ng_id) {
        this.ng_id = ng_id;
    }

    public String getSz_name() {
        return sz_name;
    }

    public void setSz_name(String sz_name) {
        this.sz_name = sz_name;
    }

    public int getNg_creator() {
        return ng_creator;
    }

    public void setNg_creator(int ng_creator) {
        this.ng_creator = ng_creator;
    }

    public long getTs_create() {
        return ts_create;
    }

    public void setTs_create(long ts_create) {
        this.ts_create = ts_create;
    }

}
