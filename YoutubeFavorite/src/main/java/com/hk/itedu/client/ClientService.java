package com.hk.itedu.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.itedu.client.dao.ClientMapper;
import com.hk.itedu.model.YoutubeVO;

@Service
public class ClientService {
	@Autowired
	private ClientMapper mapper;
	
	public List<YoutubeVO> getList() {
		
		
		return mapper.getList();
	}
	
}
