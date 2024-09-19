package com.entity.view;

import com.entity.DiscussgonggaolanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公告栏评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 15:31:40
 */
@TableName("discussgonggaolan")
public class DiscussgonggaolanView  extends DiscussgonggaolanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussgonggaolanView(){
	}
 
 	public DiscussgonggaolanView(DiscussgonggaolanEntity discussgonggaolanEntity){
 	try {
			BeanUtils.copyProperties(this, discussgonggaolanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
