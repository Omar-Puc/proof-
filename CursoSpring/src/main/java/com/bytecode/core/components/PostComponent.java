package com.bytecode.core.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.bytecode.core.model.Post;

@Component("com.bytecode.core.components.PostComponent")
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class PostComponent {

	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1,"Desarrollo web","Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg",new Date()));
		post.add(new Post(2,"Desarrollo web Front-End","Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg",new Date()));
		post.add(new Post(3,"Desarrollo web Back-End","Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg",new Date()));
		post.add(new Post(4,"Desarrollo web UX/UI","Desarrollo web es un término que define la creación de sitios web para Internet o una intranet.","http://localhost/img/post.jpg",new Date()));
		
		return post;
	}
	
}
