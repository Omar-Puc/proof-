package com.bytecode.core.services.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.bytecode.core.model.Post;
import com.bytecode.core.services.PostService;

@Service
public class PostServiceImpl implements PostService {
	private final Log log = LogFactory.getLog(getClass());

	@Override
	public List<Post> validation(List<Post> posts) throws NullPointerException {

		//System.out.println("SERVICE ONE");
		log.info("SERVICE ONE");
		for (Post post : posts) {
			if (post.getTitulo() == null) {
				throw new NullPointerException("La casilla \"TITLE\" está vacia");
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
