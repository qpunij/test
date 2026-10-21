package game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterFrance extends JFrame implements ActionListener {
    // 用户数据存储（静态变量，所有实例共享）
    public static ArrayList<User> userList = new ArrayList<>();

    // 组件
    JTextField usernameField;
    JPasswordField passwordField;
    JPasswordField confirmPasswordField;
    JButton registerButton;
    JButton resetButton;
    JButton loginButton;

    public RegisterFrance() {
        // 初始化界面
        initFrame();
        initComponents();

        this.setVisible(true);
    }

    private void initFrame() {
        this.setSize(400, 350);
        this.setTitle("注册界面");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }

    private void initComponents() {
        // 背景图片
        ImageIcon bgIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\background.png");
        JLabel bgLabel = new JLabel(bgIcon);
        bgLabel.setBounds(0, 0, 400, 350);
        this.getContentPane().add(bgLabel, 0);

        // 用户名
        ImageIcon usernameIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\注册用户名.png");
        JLabel usernameLabel = new JLabel(usernameIcon);
        usernameLabel.setBounds(50, 50, 100, 30);
        this.getContentPane().add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(160, 50, 180, 30);
        this.getContentPane().add(usernameField);

        // 密码
        ImageIcon passwordIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\注册密码.png");
        JLabel passwordLabel = new JLabel(passwordIcon);
        passwordLabel.setBounds(50, 100, 100, 30);
        this.getContentPane().add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 100, 180, 30);
        this.getContentPane().add(passwordField);

        // 确认密码
        ImageIcon confirmIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\再次输入密码.png");
        JLabel confirmLabel = new JLabel(confirmIcon);
        confirmLabel.setBounds(50, 150, 100, 30);
        this.getContentPane().add(confirmLabel);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(160, 150, 180, 30);
        this.getContentPane().add(confirmPasswordField);

        // 注册按钮
        ImageIcon registerIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\注册按钮.png");
        registerButton = new JButton(registerIcon);
        registerButton.setBounds(80, 210, 100, 35);
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(this);
        this.getContentPane().add(registerButton);

        // 重置按钮
        ImageIcon resetIcon = new ImageIcon("C:\\Users\\qpunij\\IdeaProjects\\test\\image\\register\\重置按钮.png");
        resetButton = new JButton(resetIcon);
        resetButton.setBounds(210, 210, 100, 35);
        resetButton.setBorderPainted(false);
        resetButton.setContentAreaFilled(false);
        resetButton.addActionListener(this);
        this.getContentPane().add(resetButton);

        // 已有账号，去登录
        loginButton = new JButton("已有账号？去登录");
        loginButton.setBounds(140, 260, 120, 30);
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(this);
        this.getContentPane().add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            register();
        } else if (e.getSource() == resetButton) {
            reset();
        } else if (e.getSource() == loginButton) {
            this.dispose();
            new LoginFance();
        }
    }

    private void register() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword()).trim();
        String confirmPassword = new String(confirmPasswordField.getPassword()).trim();

        // 验证用户名
        if (username.length() < 3 || username.length() > 12) {
            JOptionPane.showMessageDialog(this, "用户名长度必须在3-12位之间！");
            return;
        }

        // 验证密码
        if (password.length() < 6 || password.length() > 16) {
            JOptionPane.showMessageDialog(this, "密码长度必须在6-16位之间！");
            return;
        }

        // 验证两次密码是否一致
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "两次输入的密码不一致！");
            return;
        }

        // 验证用户名是否已存在
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                JOptionPane.showMessageDialog(this, "用户名已存在！");
                return;
            }
        }

        // 注册成功
        userList.add(new User(username, password));
        JOptionPane.showMessageDialog(this, "注册成功！");
        reset();
    }

    private void reset() {
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
    }
}
