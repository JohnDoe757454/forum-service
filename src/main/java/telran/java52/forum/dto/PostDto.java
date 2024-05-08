package telran.java52.forum.dto;

import java.time.LocalDateTime;
import java.util.List;

public class PostDto {
	String id;
	String title;
	String content;
	String author;
	LocalDateTime dateCreated;
	String[] tags;
	Integer likes;
	List<CommentDto> comments;
}
