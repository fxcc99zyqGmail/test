package com.alitily.controller;

import com.alitily.bean.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileReader;
import java.io.Reader;

@RestController
public class TestController {

    @Autowired
    private ResponseResult responseResult;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/getMock")
    public ResponseResult getMock(){
        String str = "《代码大全》这本书的前3章为我们提供了关于软件开发的深入见解和实用技巧。以下是对这3章内容的总结：\n" +
                "\n" +
                "第1章：构建可维护的软件\n" +
                "这一章节主要关注如何编写可维护的代码。作者强调了代码质量的重要性，并提供了一些实用的建议，如使用有意义的变量名、遵循一致的编码风格、避免过多的嵌套层次等。此外，还介绍了一些有助于提高代码可读性和可维护性的设计原则，如模块化、封装和抽象。\n" +
                "\n" +
                "第2章：设计模式与重构\n" +
                "在这一章节中，作者详细介绍了设计模式的概念，并讨论了如何使用它们来优化软件结构。设计模式是一种通用的解决方案，用于解决在软件开发过程中经常出现的问题。作者还强调了重构的重要性，即通过逐步改进代码的结构来提高其质量和性能，同时不影响其功能。\n" +
                "\n" +
                "第3章：测试驱动开发\n" +
                "这一章节主要关注测试驱动开发（TDD）的概念。作者解释了TDD的基本原理，即首先编写一个失败的测试用例，然后编写代码以使测试用例通过，最后对代码进行重构以提高其质量。这种方法有助于确保软件的正确性和稳定性，同时也鼓励开发人员关注代码的质量。\n" +
                "\n" +
                "总之，《代码大全》的前3章为我们提供了一个全面的指南，帮助我们编写出高质量、可维护和可扩展的代码。通过遵循这些原则和实践，我们可以提高软件开发的效率，减少错误和缺陷，从而为用户提供更好的软件产品。";
        responseResult.setRespCode(200);
        responseResult.setRespMsg("success");
        responseResult.setRespData(str);
        return responseResult;
    }

    @GetMapping("/getMock2")
    public ResponseResult getMock2() throws Exception {
        String str = "《代码大全》这本书的前3章为我们提供了关于软件开发的深入见解和实用技巧。以下是对这3章内容的总结：\n" +
                "\n" +
                "第1章：构建可维护的软件\n" +
                "这一章节主要关注如何编写可维护的代码。作者强调了代码质量的重要性，并提供了一些实用的建议，如使用有意义的变量名、遵循一致的编码风格、避免过多的嵌套层次等。此外，还介绍了一些有助于提高代码可读性和可维护性的设计原则，如模块化、封装和抽象。\n" +
                "\n" +
                "第2章：设计模式与重构\n" +
                "在这一章节中，作者详细介绍了设计模式的概念，并讨论了如何使用它们来优化软件结构。设计模式是一种通用的解决方案，用于解决在软件开发过程中经常出现的问题。作者还强调了重构的重要性，即通过逐步改进代码的结构来提高其质量和性能，同时不影响其功能。\n" +
                "\n" +
                "第3章：测试驱动开发\n" +
                "这一章节主要关注测试驱动开发（TDD）的概念。作者解释了TDD的基本原理，即首先编写一个失败的测试用例，然后编写代码以使测试用例通过，最后对代码进行重构以提高其质量。这种方法有助于确保软件的正确性和稳定性，同时也鼓励开发人员关注代码的质量。\n" +
                "\n" +
                "总之，《代码大全》的前3章为我们提供了一个全面的指南，帮助我们编写出高质量、可维护和可扩展的代码。通过遵循这些原则和实践，我们可以提高软件开发的效率，减少错误和缺陷，从而为用户提供更好的软件产品。";
//        responseResult.setRespCode(200);
//        responseResult.setRespMsg("success");
//        responseResult.setRespData(str);
//        return responseResult;
        Reader r = new FileReader(str);
        return responseResult;
    }
}
