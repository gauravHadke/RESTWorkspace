package com.example.binding;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.servlet.resource.ResourceTransformerSupport;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book extends RepresentationModel<Book>{

	private int bookId;
	private String bookName;
	private double bookPrice;
	private String bookAuthor;
}
