######################################################################################################################################
#						  Introduction                                                                    #
######################################################################################################################################

-> This assignment, et2536-saad15, consists of four folders of four individual tasks named as ASSIGNMENT1, ASSIGNMENT2, ASSIGNMENT3, ASSIGNMENT4. Main folder contains readme for all the assignments and a database configuration file(db.conf) of a special format, which is used as the access to all the assignments.Each folder contains a readme file and a Makefile if necessary a frontend script(index.X) and a backend script and other necessary files.

-> Please follow this readme file and also the readme files in the individual folders, or else the solution might not work properly.

######################################################################################################################################
#					     Credintials for db.conf                                                              #
######################################################################################################################################

-> In this file the credentials are entered to the respective titles. This file follows a format as shown.

$host     = "localhost";	#IP address of the DBM
$port     = "3306";	        #Port or the DBM
$database = "myDatabase";	#Database name
$username = "myUser";		#Username
$password = "supersecret";	#Password

-> After entering the credentials the file is saved.

######################################################################################################################################
#					        Required Installations                                                            #
######################################################################################################################################

-> Before any installation, the following commands are to be entered in terminal.
	# sudo apt-get update
	# sudo apt-get upgrade

-> Web Server:
	# sudo apt-get install apache2
	
-> PHP:
	# sudo apt-get install php5 libapache2-mod-php5
	# sudo apt-get install php5-cli php5-dev
	# sudo apt-get install mysql-server
	# sudo apt-get install php5-mysql
	# sudo apt-get install php5-snmp
	# sudo apt-get install sqlite php5-sqlite
        # sudo apt-get install phpmyadmin 
-> Restart the web server after this intallation using the command, 
	# sudo service apache2 restart

-> MySQL: 
	# sudo apt-get install mysql-server (Enter the password for MySQL root user during installation)
	# sudo service mysql restart 

	Also install 
	# sudo apt-get install php5-mysql

-> RRD Tool:
	# sudo apt-get install rrdtool
	# sudo apt-get install php5-rrd

-> SNMP:
	# sudo apt-get install snmp 
	# sudo apt-get install snmpd

-> Net-SNMP:
	# wget http://sourceforge.net/projects/net-snmp/files/net-snmp/5.4.4/net-snmp-5.4.4.tar.gz
	# tar -xvzf net-snmp-5.4.4.tar.gz
	# sudo apt-get install libperl-dev
	# cd net-snmp-5.4.4
	# ./configure
	# make
	# sudo make install
	# > echo export LD_LIBRARY_PATH=/usr/local/lib >> .bashrc
	# cd perl
	# perl Makefile.PL
	# make
	# sudo make install

-> PERL Modules:
	# sudo cpan (cpan command line opens)
		upgrade (exit after completed)
	# sudo perl -MCPAN -e "install DBI"
	# sudo apt-get install librrds-perl
	# sudo apt-get install libnet-snmp-perl
	# sudo apt-get install libperl-dev
	# sudo apt-get install libsnmp-dev
	# sudo perl -MCPAN -e "install RRD::Editor"
	# sudo perl -MCPAN -e "install RRD::Simple"
	# sudo perl -MCPAN -e "install Net::SNMP"
	# sudo perl -MCPAN -e "install LWP::Simple"
______________________________________________________________________________________________________________________________________ 	
