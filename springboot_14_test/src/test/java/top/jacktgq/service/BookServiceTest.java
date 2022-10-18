package top.jacktgq.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import top.jacktgq.pojo.Book;

/**
 * @Author CandyWall
 * @Date 2022/1/24--1:11
 * @Description
 */
@SpringBootTest
@Transactional //给数据库添加回滚，使得测试对数据库的增删改不产生影响
//@Rollback(value = false) //是否事务回滚，默认值为true
public class BookServiceTest {
    @Autowired
    private IBookService bookService;
    @Test
    public void testSave() {
        Book book = new Book();
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");
        bookService.save(book);
    }
}
