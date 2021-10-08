package com.cerveira.aluguel.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class ProjectUtils {
	
	Locale BRAZIL = new Locale("pt", "BR");
	
	public LocalDate parseStringToLocalDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		formatter = formatter.withLocale(BRAZIL);
		LocalDate parsedDate = LocalDate.parse(date, formatter);
		return parsedDate;
	}

}
