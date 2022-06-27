# Ctrl-H

Ctrl-H代码结构化查询与替换工具旨在解决现有代码查询方式在精确度、实用性上有所不足的问题，通过在现有工具基础上对于代码语言进行进一步分析，从而帮助用户更精准地进行查询及替换。

该项目由北京科技大学Ctrl-H团队进行开发并提供支持，由北京科技大学软件工程教学团队提出需求并进行验收与检查。

## 项目结构

```
.
├── Project							// 后端部分
│   ├── Makefile
│   ├── grammar						// ANTLR语法文件
│   │   ├── Cpp.g4					// C/C++语法
│   │   ├── Java.g4					// Java语法
│   │   └── JavaQuery.g4			// 查询语言语法
│   ├── lib							// 后端依赖文件
│   ├── src							// 后端源码
│   │   ├── AstGenerator			// 语法树构造模块
│   │   ├── CppParser				// C/C++语法分析器（ANTLR自动生成）
│   │   ├── CppVisitor				// C/C++语法树解析模块
│   │   ├── Info					
│   │   ├── JavaParser				// Java语法分析器（ANTLR自动生成）
│   │   ├── JavaQueryParser			// 查询语言语法分析器（ANTLR自动生成）
│   │   ├── Query					// 查询语言执行模块
│   │   ├── Test					// 测试代码
│   │   ├── Visitor					// Java语法树解析模块
│   │   ├── runtime					// CLI
│   │   └── util					// 工具包，含JSON生成模块
│   └── test						// 测试用目标文件夹
├── README.md						// 本文档
├── ctrl-h-plugin					// 前端：IDEA/CLion插件项目
├── ctrl-h-plugin-1.0-SNAPSHOT.zip	// IDEA/CLion插件安装包
├── doc								// 相关文档
└── vscode-extension				// 前端：VSCode插件项目
    ├── README.md					
    ├── demo.md
    ├── lib							// 后端依赖文件
    └── src							// VSCode插件核心源码
```

