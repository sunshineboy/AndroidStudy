package com.sun.callback;


/** 
 * 这个就是小李啦 
 * @author wangpj 
 * 
 */ 
public class Li {

  
    public Li(){  
    }

    /** 
     * 相当于B类有参数为CallBack callBack的f()---->背景三 
     * @param callBack   
     * @param question  小王问的问题 
     */  
	public void executeMessage(Callback callback, String question) {
		System.out.println("小王问的问题--->" + question);  
		
		try {
			//模拟小李办自己的事情需要很长时间  
	        Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * 小李处理完自己的问题之后，想到1+1=？的答案为2
		 */
		String result = "答案是2";  
		
		/*
		 * 于是就打电话告诉小王，调用小王中的方法
		 * 这就相当于B类调用A类的方法D
		 */
		callback.solve(result);
		
	}  
	
	

}
