package com.sun.callback;


/**  
*   
* 项目名称：SunshineCollect  
* 类名称：Wang  
* 类描述：这个好比小王,实现了一个回调接口CallBack，相当于----->背景一   详情参考readme
* 创建人：wangpj  
* 创建时间：2013-6-26 下午4:20:40  
* 修改人：wangpj  
* 修改时间：2013-6-26 下午4:20:40  
* 修改备注：  
* @version   
*   
*/
public class Wang implements Callback{

	 /** 
     * 小李对象的引用 
     * 相当于----->背景二 
     */  
    private Li li;   
  
    /** 
     * 小王的构造方法，持有小李的引用 
     * @param li 
     */  
    public Wang(Li li){  
        this.li = li;  
    }  
	
    /**
     *  
     * askQuestion(小王通过这个方法去问小李的问题   
     * @param question  就是小王要问的问题,1 + 1 = ? 
     */
	public void askQuestion(final String question) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				/** 
                 * 小王调用小李中的方法，在这里注册回调接口 
                 * 这就相当于A类调用B的方法C 
                 */  
                li.executeMessage(Wang.this, question);   
			}
		}).start();
		
		 //小网问完问题挂掉电话就去干其他的事情了，诳街去了  
        play();  
	}
	
	
	private void play() {
		System.out.println("我去打篮球了!");
	}

	@Override
	public void solve(String result) {
		System.out.println(result);
	}

}
