sudo apt update
sudo apt install mysql-server -y
sudo apt install mysql-client -y
sudo service mysql start
sudo service mysql status
sudo ss -tap | grep mysql
/usr/bin/mysql -u root -p
