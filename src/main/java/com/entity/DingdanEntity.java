package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 订单
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
@TableName("dingdan")
public class DingdanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanEntity() {
		
	}
	
	public DingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 菜品编号
	 */
					
	private String caipinbianhao;
	
	/**
	 * 菜品名称
	 */
					
	private String caipinmingcheng;
	
	/**
	 * 菜品类别
	 */
					
	private String caipinleibie;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 合计
	 */
					
	private String heji;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 原材料
	 */
					
	private String yuancailiao;
	
	/**
	 * 烹饪方法
	 */
					
	private String pengrenfangfa;
	
	/**
	 * 菜品特色
	 */
					
	private String caipintese;
	
	/**
	 * 菜品介绍
	 */
					
	private String caipinjieshao;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：菜品编号
	 */
	public void setCaipinbianhao(String caipinbianhao) {
		this.caipinbianhao = caipinbianhao;
	}
	/**
	 * 获取：菜品编号
	 */
	public String getCaipinbianhao() {
		return caipinbianhao;
	}
	/**
	 * 设置：菜品名称
	 */
	public void setCaipinmingcheng(String caipinmingcheng) {
		this.caipinmingcheng = caipinmingcheng;
	}
	/**
	 * 获取：菜品名称
	 */
	public String getCaipinmingcheng() {
		return caipinmingcheng;
	}
	/**
	 * 设置：菜品类别
	 */
	public void setCaipinleibie(String caipinleibie) {
		this.caipinleibie = caipinleibie;
	}
	/**
	 * 获取：菜品类别
	 */
	public String getCaipinleibie() {
		return caipinleibie;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：合计
	 */
	public void setHeji(String heji) {
		this.heji = heji;
	}
	/**
	 * 获取：合计
	 */
	public String getHeji() {
		return heji;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：原材料
	 */
	public void setYuancailiao(String yuancailiao) {
		this.yuancailiao = yuancailiao;
	}
	/**
	 * 获取：原材料
	 */
	public String getYuancailiao() {
		return yuancailiao;
	}
	/**
	 * 设置：烹饪方法
	 */
	public void setPengrenfangfa(String pengrenfangfa) {
		this.pengrenfangfa = pengrenfangfa;
	}
	/**
	 * 获取：烹饪方法
	 */
	public String getPengrenfangfa() {
		return pengrenfangfa;
	}
	/**
	 * 设置：菜品特色
	 */
	public void setCaipintese(String caipintese) {
		this.caipintese = caipintese;
	}
	/**
	 * 获取：菜品特色
	 */
	public String getCaipintese() {
		return caipintese;
	}
	/**
	 * 设置：菜品介绍
	 */
	public void setCaipinjieshao(String caipinjieshao) {
		this.caipinjieshao = caipinjieshao;
	}
	/**
	 * 获取：菜品介绍
	 */
	public String getCaipinjieshao() {
		return caipinjieshao;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
