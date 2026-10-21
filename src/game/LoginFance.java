package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFance extends JFrame implements ActionListener {
    // 组件
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton registerButton;

    public LoginFance() {
        // 初始化界面
        initComponents();
        initFrame();
      

        this.setVisible(true);
    }

    private void initFrame() {
        this.setSize(400, 350);
        this.setTitle("登录界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    private void initComponents() {
        // 背景图片
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\login\\background.png");
        JLabel bgLabel = new JLabel(bgIcon);
        bgLabel.setBounds(0, 0, 400, 350);
        this.getContentPane().add(bgLabel, 0);

        // 用户名
        ImageIcon usernameIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\login\\用户名.png");
        JLabel usernameLabel = new JLabel(usernameIcon);
        usernameLabel.setBounds(50, 90, 100, 30);
        System.out.println("登录");
        this.getContentPane().add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(160, 70, 180, 30);
        this.getContentPane().add(usernameField);

        // 密码
        ImageIcon passwordIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\login\\密码.png");
        JLabel passwordLabel = new JLabel(passwordIcon);
        passwordLabel.setBounds(50, 120, 100, 30);
        this.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 120, 180, 30);
        this.getContentPane().add(passwordField);

        // 登录按钮
        ImageIcon loginIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\login\\登录按钮.png");
        loginButton = new JButton(loginIcon);
        loginButton.setBounds(80, 180, 100, 35);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(this);
        this.getContentPane().add(loginButton);

        // 注册按钮
        ImageIcon registerIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\login\\注册按钮.png");
        registerButton = new JButton(registerIcon);
        registerButton.setBounds(210, 180, 100, 35);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(this);
        this.getContentPane().add(registerButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            login();
        } else if (e.getSource() == registerButton) {
            this.dispose();
            new RegisterFrance();
        }
    }

    private void login() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();

        // 验证输入是否为空
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "用户名或密码不能为空！");
            return;
        }

        // 验证用户名和密码
        boolean found = false;
        for (User user : RegisterFrance.userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                found = true;
                break;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(this, "登录成功！");
            this.dispose();
            new GameFrance();
        } else {
            JOptionPane.showMessageDialog(this, "用户名或密码错误！");
        }
    }
}
