package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
public class SysResult {
	private Integer status;//200正常 201 异常
	private String msg;
	private Object data;

	public static SysResult success() {
		return new SysResult(200,"成功",null);
	}
	public static SysResult success(Object data) {
		return new SysResult(200,"成功",data);
	}
	public static SysResult success(String msg ,Object data) {
		return new SysResult(200,msg,data);
	}
	public static SysResult fail() {
		return new SysResult(201, "失败", null);
	}
}
