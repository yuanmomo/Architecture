
/**
 * Project Name : Architecture
 * File Name    : UserDAOImpl.java
 * Package Name : net.yuanmomo.dao.impl
 * Created on   : 2014-1-23下午5:44:55
 * Author       : Hongbin Yuan
 * Blog         : yuanmomo.net
 * Company      : 成都逗溜网科技有限公司  
 */

package net.yuanmomo.dao.impl;

import java.util.List;

import net.yuanmomo.dao.mapper.UserMapper;
import net.yuanmomo.dao.vo.User;
import net.yuanmomo.dao.vo.UserCriteria;
import net.yuanmomo.exception.DAOException;
import net.yuanmomo.resource.ResourceParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName : UserDAOImpl 
 * Function  : TODO ADD FUNCTION. 
 * Reason    : TODO ADD REASON. 
 * Date      : 2014-1-23 下午5:44:55 
 *
 * @author   : Hongbin Yuan
 * @version  
 * @since      JDK 1.6
 * @see 	 
 */
@Service
public class UserDAOImpl implements UserMapper{
	@Autowired
	private UserMapper userMapper;

	/**
	 * countByExample:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param example
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#countByExample(net.yuanmomo.dao.vo.UserCriteria)
	 */
	@Override
	public int countByExample(UserCriteria example) {
		return 0;
	}

	/**
	 * deleteByExample:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param example
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#deleteByExample(net.yuanmomo.dao.vo.UserCriteria)
	 */
	@Override
	public int deleteByExample(UserCriteria example) {
		return 0;
	}

	/**
	 * deleteByPrimaryKey:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param id
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return 0;
	}

	/**
	 * insert:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @return
	 * @throws DAOException 
	 * @see net.yuanmomo.dao.mapper.UserMapper#insert(net.yuanmomo.dao.vo.User)
	 */
	@Override
	public int insert(User record) throws DAOException,Exception  {
		System.out.println("DAO的实现层，简单的数据库读取和写入操作");
		System.out.println("DAO的实现层，可能抛出sql默认异常");
		System.out.println("DAO的实现层，可能抛出自定义的dao异常");
		int count = this.userMapper.insertSelective(record);
		if(count <= 0){
			throw new DAOException(ResourceParam.DAO_INSERT_NONE_EXCEPTION,"Insert Object Error, the Object User is "+record);
		}
		return count;
	}

	/**
	 * insertSelective:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#insertSelective(net.yuanmomo.dao.vo.User)
	 */
	@Override
	public int insertSelective(User record) {
		return 0;
	}

	/**
	 * selectByExample:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param example
	 * @return
	 * @throws DAOException 
	 * @see net.yuanmomo.dao.mapper.UserMapper#selectByExample(net.yuanmomo.dao.vo.UserCriteria)
	 */
	@Override
	public List<User> selectByExample(UserCriteria example) throws DAOException,Exception {
		System.out.println("DAO的实现层，简单的数据库读取和写入操作");
		System.out.println("DAO的实现层，可能抛出sql默认异常");
		System.out.println("DAO的实现层，可能抛出自定义的dao异常");
		return this.userMapper.selectByExample(example);
	}

	/**
	 * selectByPrimaryKey:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param id
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public User selectByPrimaryKey(Integer id) {
		return null;
	}

	/**
	 * updateByExampleSelective:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @param example
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#updateByExampleSelective(net.yuanmomo.dao.vo.User, net.yuanmomo.dao.vo.UserCriteria)
	 */
	@Override
	public int updateByExampleSelective(User record, UserCriteria example) {
		return 0;
	}

	/**
	 * updateByExample:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @param example
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#updateByExample(net.yuanmomo.dao.vo.User, net.yuanmomo.dao.vo.UserCriteria)
	 */
	@Override
	public int updateByExample(User record, UserCriteria example) {
		return 0;
	}

	/**
	 * updateByPrimaryKeySelective:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#updateByPrimaryKeySelective(net.yuanmomo.dao.vo.User)
	 */
	@Override
	public int updateByPrimaryKeySelective(User record) {
		return 0;
	}

	/**
	 * updateByPrimaryKey:. <br/>
	 *
	 * @author Hongbin Yuan
	 * @param record
	 * @return
	 * @see net.yuanmomo.dao.mapper.UserMapper#updateByPrimaryKey(net.yuanmomo.dao.vo.User)
	 */
	@Override
	public int updateByPrimaryKey(User record) {
		return 0;
	}

	/**
	 * userMapper.
	 *
	 * @param   userMapper    the userMapper to set
	 * @since   JDK 1.6
	 */
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
}
