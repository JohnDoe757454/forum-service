package telran.java52.forum.service;

import java.util.List;
import java.util.Set;

import telran.java52.forum.dto.AddPostDto;
import telran.java52.forum.dto.AddCommentDto;
import telran.java52.forum.dto.PostDto;
import telran.java52.forum.dto.PeriodDto;

public interface ForumService {
	PostDto addPost(AddPostDto addPostDto, String user);

	PostDto findPostById(String id);

	void addLike(String id);

	List<PostDto> findPostsByAuthor(String author);

	PostDto addComment(AddCommentDto addCommentDto,String id, String user);

	PostDto deletePost(String id);

	List<PostDto> findPostsByTags(Set<String> tags);

	List<PostDto> findPostsByPeriod(PeriodDto periodDto);

	PostDto updatePost(AddPostDto addPostDto, String id);
}
