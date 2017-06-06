CREATE TABLE `user`(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255),
  password VARCHAR(255),
  nickname VARCHAR(255),
  gender VARCHAR(20),
  avatar VARCHAR(2000),
  birth_date DATE,
  email VARCHAR(255),
  phone_number VARCHAR(20),
  status VARCHAR(20),
  created_by VARCHAR(255),
  updated_by VARCHAR(255),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
