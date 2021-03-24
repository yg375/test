package com.springboot.palindrome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.palindrome.entity.Str;
import com.springboot.palindrome.repository.StrRepository;

@RepositoryRestController
@RequestMapping("/reverse")
public class reverseStrController {
	@Autowired
	private StrRepository strRepository;

	@PostMapping(path = "/demo")
	public void savePalindraome(@RequestBody Str s){
		Str s1 = new Str();
		s1.setStr(longestPalindrome(s.getStr()));
		strRepository.save(s1);
		System.out.println(s1.getStr());
////		Str sub = new Str();
////		String s_rev = longestPalindrome(s);
////		sub.setStr(s);
////		strRepository.save(sub);
//		System.out.println("hi");
	}
	
	public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        int start = 0, end = 0;
        String res;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private int expandFromMiddle(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        return j - i - 1;
    }
	
}
