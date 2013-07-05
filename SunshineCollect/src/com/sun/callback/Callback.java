package com.sun.callback;


/**  
*   
* 项目名称：SunshineCollect  
* 类名称：Callback  
* 类描述：  这是一个回调接口 ,详情参考readme
* 创建人：wangpj  
* 创建时间：2013-6-26 下午4:14:38  
* 修改人：wangpj  
* 修改时间：2013-6-26 下午4:14:38  
* 修改备注：  
* @version 1.0
*   
*/
public interface Callback {

	
	/**
	 * 
	 * solve(这个是小李知道答案时要调用的函数告诉小王，也就是回调函数 )  
	 * @param  result   
	 */
	public void solve(String result); 
	
}
