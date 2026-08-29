-- practice2 데이터베이스 생성
DROP DATABASE IF EXISTS practice2;
CREATE DATABASE practice2;
USE practice2;

-- [문제 1]
CREATE TABLE members(
    member_id INT AUTO_INCREMENT,
    member_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    join_date DATETIME DEFAULT NOW(),
    is_active BOOLEAN DEFAULT TRUE,
    PRIMARY KEY(member_id)
);

-- [문제 2]
CREATE TABLE products(
    product_id INT AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    price INT UNSIGNED NOT NULL,
    stock INT NOT NULL DEFAULT 0,
    created_at DATETIME DEFAULT NOW(),
    PRIMARY KEY(product_id)
);

-- [문제 3]
CREATE TABLE orders(
    order_id BIGINT AUTO_INCREMENT,
    member_id INT,
    order_date DATETIME DEFAULT NOW(),
    total_price INT UNSIGNED NOT NULL,
    PRIMARY KEY(order_id),
    FOREIGN KEY(member_id) REFERENCES members(member_id)
);

-- [문제 4]
CREATE TABLE order_items(
    item_id INT AUTO_INCREMENT,
    order_id BIGINT,
    product_id INT,
    quantity INT DEFAULT 1,
    price INT UNSIGNED NOT NULL,
    PRIMARY KEY(item_id),
    FOREIGN KEY(order_id) REFERENCES orders(order_id),
    FOREIGN KEY(product_id) REFERENCES products(product_id)
);

-- [문제 5]
CREATE TABLE students(
    student_id VARCHAR(10),
    student_name VARCHAR(30) NOT NULL,
    major VARCHAR(50),
    grade TINYINT UNSIGNED,
    enrolled_date DATE,
    PRIMARY KEY(student_id)
);

-- [문제 6]
CREATE TABLE employees(
    emp_id INT AUTO_INCREMENT,
    emp_name VARCHAR(40) NOT NULL,
    salary INT UNSIGNED NOT NULL,
    hire_date DATE NOT NULL,
    department VARCHAR(50),
    PRIMARY KEY(emp_id)
);

-- [문제 7]
CREATE TABLE boards(
    board_id INT AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    writer_id INT,
    created_at DATETIME DEFAULT NOW(),
    PRIMARY KEY(board_id),
    FOREIGN KEY(writer_id) REFERENCES members(member_id)
);

-- [문제 8]
CREATE TABLE comments(
    comment_id INT AUTO_INCREMENT,
    board_id INT,
    writer_id INT,
    content VARCHAR(300) NOT NULL,
    created_at DATETIME DEFAULT NOW(),
    PRIMARY KEY(comment_id),
    FOREIGN KEY(board_id) REFERENCES boards(board_id),
    FOREIGN KEY(writer_id) REFERENCES members(member_id)
);

-- [문제 9]
CREATE TABLE payments(
    payment_id BIGINT AUTO_INCREMENT,
    order_id BIGINT,
    payment_amount INT UNSIGNED NOT NULL,
    payment_method VARCHAR(30),
    payment_date DATETIME DEFAULT NOW(),
    PRIMARY KEY(payment_id),
    FOREIGN KEY(order_id) REFERENCES orders(order_id)
);

-- [문제 10]
CREATE TABLE reviews(
    review_id INT AUTO_INCREMENT,
    product_id INT,
    member_id INT,
    rating TINYINT UNSIGNED NOT NULL,
    review_text TEXT,
    created_at DATETIME DEFAULT NOW(),
    PRIMARY KEY(review_id),
    FOREIGN KEY(product_id) REFERENCES products(product_id),
    FOREIGN KEY(member_id) REFERENCES members(member_id)
);