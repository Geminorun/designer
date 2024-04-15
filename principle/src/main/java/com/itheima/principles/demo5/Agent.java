package com.itheima.principles.demo5;

import java.net.SocketTimeoutException;

/**
 * @Auther: lyl
 * @Date: 2024/1/24 10:13
 * @Description:
 */
public class Agent {
    private Star star;
    private Fans fans;

    private Company company;

    public void metting(){
        System.out.println(star.getName() + "和"+ fans.getName() +"见面");
    }

    public void bussiness(){
        System.out.println(star.getName() + "和"+ company.getName() +"洽谈");
    }

    public Agent() {
    }

    public Agent(Star star, Fans fans, Company company) {
        this.star = star;
        this.fans = fans;
        this.company = company;
    }

    /**
     * 获取
     * @return star
     */
    public Star getStar() {
        return star;
    }

    /**
     * 设置
     * @param star
     */
    public void setStar(Star star) {
        this.star = star;
    }

    /**
     * 获取
     * @return fans
     */
    public Fans getFans() {
        return fans;
    }

    /**
     * 设置
     * @param fans
     */
    public void setFans(Fans fans) {
        this.fans = fans;
    }

    /**
     * 获取
     * @return company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * 设置
     * @param company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    public String toString() {
        return "Agent{star = " + star + ", fans = " + fans + ", company = " + company + "}";
    }
}
