# Stack-and-Queue

AP CSA 教学项目：数组实现的栈与队列，附交互式可视化。

## 项目结构（三层）

```
Stack-and-Queue/
├── ArrayStack.java       # 学生用 stub — 待填空
├── ArrayQueue.java       # 学生用 stub — 待填空
├── Main.java             # 学生用 stub — 待填空
├── answer/               # 完整参考实现（package answer;）
├── visualization/        # 交互式可视化 demo
└── AGENTS.md
```

- **根目录** = 课堂练习 skeleton，文件不全/不可编译，学生在此完成。
- **answer/** = 参考答案，在 `answer` 包下，使用 `javac answer/*.java` 编译。
- **visualization/** = 独立 HTML 可视化工具，也包含 standalone 的 Java 实现（默认包，可单独运行）。

## 编译与运行

无构建工具，直接 `javac` / `java`。

```sh
# 编译并运行 visualization（默认包，无依赖）
cd visualization && javac ArrayStack.java ArrayQueue.java Main.java && java Main

# 编译 answer 包
javac answer/*.java
java answer.Main

# 可视化（浏览器，无服务端依赖）
open visualization/index.html
```

## 代码注意事项

- **根目录 stub 不可编译。** 学生的填空版本尚未完成，缺少方法体。不要尝试编译或运行根目录文件——它们只是骨架。
- **answer/ 文件在 `package answer;` 下。** 任何 agent 在引用/拷贝 answer 代码时注意保留或调整 package 声明。visualization/ 下的副本是默认包（无 package 声明）。
- **visualization/index.html** 是完全自包含的静态页面（内联 CSS + JS，无外部依赖），直接在浏览器打开即可。它内置了 ArrayStack 和 ArrayQueue 的 Java 源码副本作为代码显示。

## Git 历史

- `6d494d2` init — 初始 stub
- `f5da7d5` 5.7 end — 加入 DequeStack/DequeQueue 参考实现，class 文件移至 answer/
- `7dfc689` 5.7 self learning! — 根目录清空为 stub，完整实现移至 answer/

## 对 Agent 的工作指引

- **如果用户在使用根目录文件：** 它们是 skeleton/template，不要假设它们可运行。不要修改它们，除非用户明确要求"完成填空"。
- **如果用户提到"答案"或"参考实现"：** 去 answer/ 看。
- **如果用户提到"可视化"或"演示"：** 去 visualization/index.html，直接在浏览器打开即可。
- **本项目无测试、无 linter、无 CI。** 验证正确性的方法是编译 + 运行 answer 或 visualization 中的实现。
