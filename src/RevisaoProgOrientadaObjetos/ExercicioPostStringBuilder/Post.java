package RevisaoProgOrientadaObjetos.ExercicioPostStringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post(Date momment, String title, String content, Integer likes) {
		this.momment = momment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comment> getComments(){
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); //UTILIZANDO O STRINGBUILDER PARA MONTAR UMA STRING COM VÁRIOS ELEMENTOS DE FORMA MAIS PRÁTICA
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();		
	}
	
	
}
