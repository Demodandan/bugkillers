package org.bugkillers.core.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.bugkillers.core.domain.QuestionDO;

public interface QuestionDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Delete({
        "delete from bk_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Insert({
        "insert into bk_question (id, tag_id, ",
        "user_id, question_text, ",
        "create_time, update_time, ",
        "bk_create, bk_modified, ",
        "dr)",
        "values (#{id,jdbcType=INTEGER}, #{tagId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{questionText,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{bkCreate,jdbcType=TIMESTAMP}, #{bkModified,jdbcType=TIMESTAMP}, ",
        "#{dr,jdbcType=TINYINT})"
    })
    int insert(QuestionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    int insertSelective(QuestionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Select({
        "select",
        "id, tag_id, user_id, question_text, create_time, update_time, bk_create, bk_modified, ",
        "dr",
        "from bk_question",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    QuestionDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    int updateByPrimaryKeySelective(QuestionDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bk_question
     *
     * @mbggenerated Mon Jun 08 20:50:03 CST 2015
     */
    @Update({
        "update bk_question",
        "set tag_id = #{tagId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "question_text = #{questionText,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "update_time = #{updateTime,jdbcType=TIMESTAMP},",
          "bk_create = #{bkCreate,jdbcType=TIMESTAMP},",
          "bk_modified = #{bkModified,jdbcType=TIMESTAMP},",
          "dr = #{dr,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(QuestionDO record);
}