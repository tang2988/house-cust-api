package com.xxh.fang.api;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.ChangeCustomerStatusVo;
import com.xxh.fang.entity.ChangeLoginPasswordVo;
import com.xxh.fang.entity.CstcustormerVo;
import com.xxh.fang.entity.ModifyUserProfileReqVo;
import com.xxh.fang.entity.RetrievePasswordVo;
import com.xxh.fang.entity.UserAuthenticationVo;

public interface CstcustormerApi {

	/**
	 * 注册
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo addCstcustormerVo(CstcustormerVo cstcustormervo);

	/**
	 * 修改登陆密码
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo changeLoginPassword(ChangeLoginPasswordVo changeLoginPasswordVo);

	/**
	 * 修改账户状态：10-正常; 20-禁用',
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo changeCustomerStatus(ChangeCustomerStatusVo changeCustomerStatusVo);

	/**
	 * 用户登陆
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo cstCustomerLogin(CstcustormerVo Cstcustormervo);

	/**
	 * 修改用户头像
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo modifyUserProfile(ModifyUserProfileReqVo modifyUserProfileReqVo);

	/**
	 * 用户认证
	 * 
	 * @param CstcustormerVo
	 * @return
	 */
	public ResVo userAuthentication(UserAuthenticationVo userAuthenticationVo);

	/**
	 * 找回登陆密码
	 * 
	 * @param loginPassword
	 * @param VerificationCode
	 * @return
	 */
	public ResVo retrievePassword(RetrievePasswordVo retrievePasswordVo);

}
