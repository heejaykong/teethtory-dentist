package com.mycompany.webapp.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mycompany.webapp.dto.Attachment;
import com.mycompany.webapp.dto.Tooth;

public interface AttatchmentDao {
	public List<Attachment> selectBytreatno(int treatno);
	public int insert(Attachment attachment);
	public int update(@Param("attachment") Attachment attachment, @Param("newattachment") Attachment newattachment);
	public int delete(Attachment attachment);
}
