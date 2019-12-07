# 实验五
实验五 综合性实验 学生选课系统
# 实验报告
## 实验目的
##### 分析学生选课系统
##### 使用GUI窗体及其组件设计窗体界面
##### 完成学生选课过程业务逻辑编程
##### 基于文件保存并读取数据
##### 处理异常
## 核心代码
```javascript
jbRest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfName.setText("");
                tfNum.setText("");
                rb1.setSelected(true);
                cb1.setSelected(false);
                t1.setSelectedIndex(0);
                cb2.setSelected(false);
                t2.setSelectedIndex(0);
                allInfo.setText("");
            }
        });
    }
```
```javascript
public void actionPerformed(ActionEvent e) {
		File file = new File("d:\\test.txt");  
        try {  
            file.createNewFile(); // 创建文件  
        } catch (IOException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
  
        // 向文件写入内容(输出流)  
        String str = allInfo.getText();  
        byte bt[] = new byte[1024];  
        bt = str.getBytes();  
        try {  
            FileOutputStream in = new FileOutputStream(file);  
            try {  
                in.write(bt, 0, bt.length);  
                in.close();  
                // boolean success=true;  
                // System.out.println("写入文件成功");  
            } catch (IOException e1) {  
                // TODO Auto-generated catch block  
                e1.printStackTrace();  
            }  
        } catch (FileNotFoundException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        try {  
            // 读取文件内容 (输入流)  
            FileInputStream out = new FileInputStream(file);  
            InputStreamReader isr = new InputStreamReader(out);  
            int ch = 0;  
            while ((ch = isr.read()) != -1) {  
                System.out.print((char) ch);  
            }  
        } catch (Exception e1) {  
            // TODO: handle exception  
        }  
    }  
```
## 实验结果
![image](https://github.com/LvvvXinnn/A-/blob/master/images/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191207112307.png)
![image](https://github.com/LvvvXinnn/A-/blob/master/images/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191207112318.png)
![image](https://github.com/LvvvXinnn/A-/blob/master/images/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191207112553.png)
![image](https://github.com/LvvvXinnn/A-/blob/master/images/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191207163011.png)
![image](https://github.com/LvvvXinnn/A-/blob/master/images/%E5%BE%AE%E4%BF%A1%E6%88%AA%E5%9B%BE_20191207163027.png)
## 实验感想
在该实验中，我掌握如何编写异常处理、输入输出及窗口等方法
在这一系列的实验中，我基本掌握了java的编程规则、知识要
点和一些小技巧，特别是对一些概念上有了更深的理解，因正确的编出程序而带来的成就
感让我对编程更加感兴趣。
