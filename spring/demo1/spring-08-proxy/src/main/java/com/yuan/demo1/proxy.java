package com.yuan.demo1;

public class proxy implements rent{
    private landlord landlord;

    public proxy(com.yuan.demo1.landlord landlord) {
        this.landlord = landlord;
    }

    public proxy() {
    }

    @Override
    public void rent() {
        seeHouse();
        landlord.rent();
        contract();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");

    }

    public void contract(){
        System.out.println("签合同");
    }
}
