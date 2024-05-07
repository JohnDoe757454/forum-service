package telran.java52.forum.controller;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import telran.java52.forum.dto.AddPostDto;
import telran.java52.forum.dto.CommentDto;
import telran.java52.forum.dto.PeriodDto;
import telran.java52.forum.dto.PostDto;
import telran.java52.forum.service.ForumService;

@RestController
@RequiredArgsConstructor
public class ForumController {

	final ForumService forumService;

	@PostMapping("/forum/post/{user}")
	public PostDto addPost(@RequestBody AddPostDto addPostDto, @PathVariable String user) {
		return forumService.addPost(addPostDto, user);
	}

	@GetMapping("/forum/post/{postId}")
	public PostDto findPostById(@PathVariable("postId") String id) {
		return forumService.findPostById(id);
	}

	@PutMapping("/forum/{postId}/like")
	public void addLike(@PathVariable String id) {
		forumService.addLike(id);
	}

	@GetMapping("/forum/posts/author/{user}")
	public List<PostDto> findPostsByAuthor(@PathVariable("user") String author) {
		return forumService.findPostsByAuthor(author);
	}

	@PutMapping("/forum/post/{postId}/comment/{user}")
	public PostDto addComment(@RequestBody CommentDto commentDto, @PathVariable("postId") String id,
			@PathVariable String user) {
		return forumService.addComment(commentDto, id, user);
	}

	@DeleteMapping("/forum/post/{postId}")
	public PostDto deletePost(@PathVariable("postId") String id) {
		return forumService.deletePost(id);

	}

	@PostMapping("/forum/posts/tags")
	public List<PostDto> findPostsByTags(@RequestBody Set<String> tags) {
		return forumService.findPostsByTags(tags);
	}

	@PostMapping("/forum/posts/period")
	public List<PostDto> findPostsByPeriod(@RequestBody PeriodDto periodDto) {
		return forumService.findPostsByPeriod(periodDto);
	}

	@PutMapping("/forum/post/{postId}")
	public PostDto updatePost(@RequestBody AddPostDto addPostDto, @PathVariable("postId") String id) {
		return forumService.updatePost(addPostDto, id);
	}

}
