package gov.polisen.orm.maps;

import gov.polisen.orm.clients.StatusSqlProvider;
import gov.polisen.orm.examples.StatusExample;
import gov.polisen.orm.models.Status;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface StatusMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@SelectProvider(type = StatusSqlProvider.class, method = "countByExample")
	int countByExample(StatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@DeleteProvider(type = StatusSqlProvider.class, method = "deleteByExample")
	int deleteByExample(StatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Delete({ "delete from statuses", "where id = #{id,jdbcType=SMALLINT}" })
	int deleteByPrimaryKey(Short id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Insert({ "insert into statuses (id, shorthand, ", "description)",
			"values (#{id,jdbcType=SMALLINT}, #{shorthand,jdbcType=VARCHAR}, ",
			"#{description,jdbcType=VARCHAR})" })
	int insert(Status record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@InsertProvider(type = StatusSqlProvider.class, method = "insertSelective")
	int insertSelective(Status record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@SelectProvider(type = StatusSqlProvider.class, method = "selectByExample")
	@ConstructorArgs({
			@Arg(column = "id", javaType = Short.class, jdbcType = JdbcType.SMALLINT, id = true),
			@Arg(column = "shorthand", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "description", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	List<Status> selectByExample(StatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Select({ "select", "id, shorthand, description", "from statuses",
			"where id = #{id,jdbcType=SMALLINT}" })
	@ConstructorArgs({
			@Arg(column = "id", javaType = Short.class, jdbcType = JdbcType.SMALLINT, id = true),
			@Arg(column = "shorthand", javaType = String.class, jdbcType = JdbcType.VARCHAR),
			@Arg(column = "description", javaType = String.class, jdbcType = JdbcType.VARCHAR) })
	Status selectByPrimaryKey(Short id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = StatusSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Status record,
			@Param("example") StatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = StatusSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Status record,
			@Param("example") StatusExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@UpdateProvider(type = StatusSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Status record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statuses
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	@Update({ "update statuses",
			"set shorthand = #{shorthand,jdbcType=VARCHAR},",
			"description = #{description,jdbcType=VARCHAR}",
			"where id = #{id,jdbcType=SMALLINT}" })
	int updateByPrimaryKey(Status record);
}