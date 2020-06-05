package com.bytecode.core.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.bytecode.core.model.Post;
import com.bytecode.core.services.PostService;

@Service("serviceDos")
public class PostServiceImplDos implements PostService {
	private final Log log = LogFactory.getLog(getClass());
	
	@Override
	public List<Post> validation(List<Post> posts) throws NullPointerException {
		
		//System.out.println("SERVICE TWO");
		log.info("SERVICE TWO");
		for (Post post : posts) {
			if (post.getId() == 0) {
				throw new NullPointerException("La casilla \"ID\" está vacia");
			}
		}
		return posts;
	}
	
	@Override
	public void addClass(Class clazz) {
		// TODO Auto-generated method stub
		System.out.println(clazz.getName());
	}

}
