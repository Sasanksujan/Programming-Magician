######################################################################################################################################
#						  Readme     Use db.conf                                                             #
######################################################################################################################################

You are in folder assignment3.
The purpose of this assignment is to send traps to the manager of managers when the device in the network under observation is in fail state or two or more devices are in danger states. The status of every device is presented through a web dashboard.

This document describes the information about the various files in this folder, modules/software needed and steps to run this assignment.
######################################################################################################################################
#						   Contents                                                                         #
######################################################################################################################################

This folder consists of 4 files in total:
1. FullSizeRender.jpg
2. index.php
3. readme.txt
4. trapDaemon.pl

######################################################################################################################################
#                                              Software Requirements                                                                #
######################################################################################################################################

1. Operating System: Ubuntu 14.04 LTS.

2. You need to install Apache server, MySQL and PHP.

3. SNMP Modules which are needed to be installed from CPAN are:
	 Data::Dumper
	 DBD::Mysql
	 DBI
   FindBin
   File::Basename
   File::Spec::Functions
	 Net::SNMP

4. Install "snmpd". Use the terminal command "sudo apt-get install snmpd".

###################################################################################################################################### 
                                            Configuration files to be changed
######################################################################################################################################


1. Add the following lines to the snmpdtrapd.conf file in the /etc/snmp/snmptrapd.conf:

	authCommunity log,execute,net public 
	disableAuthorization yes
	#doNotLogTraps yes
	snmpTrapdAddr udp:50162
	traphandle 1.3.6.1.4.1.41717.10.* perl /path/to/et2536-dipe15/assignment3/trapDaemon.pl 
																				 (eg. /var/www/html/et2536-dipe15/assignment3/trapDaemon.pl)

2. Open file snmpd from /etc/default/snmpd and change the line:

	 TRAPDRUN=no to TRAPDRUN=yes

3. Then, use the terminal command "sudo service snmpd restart".

###################################################################################################################################### 
                                            Steps to run this assignment
######################################################################################################################################

1. Go to the terminal in move to the directory /var/www/html/et2536-dipe15/assignment3/ 
   (Move to the path of your working directory configured in your Apache server)

2. Give the trap command:

sudo snmptrap -v 1 -c public 10.1.0.74:50162 .1.3.6.1.4.1.41717.10 10.1.0.124 6 247 '' .1.3.6.1.4.1.41717.10.1 s "banana" .1.3.6.1.4.1.41717.10.2 i 3

where "" is the FQDN name, 1 is an integer describing the status of device.(0="OK", 1="PROBLEM", 2="DANGER", 3="FAIL")

3. Now, open a web browser and type the following URL: (it is assumed that the working directory is in /var/www/html/)
	 http://localhost/et2536-dipe15/assignment3/index.php

4. This page dispalys the status of all the devices. The user can also enter the device credentials of manager in this page.

5. The user can see the traps using "wireshark" or "tcpdump" command.
		
   tcpdump command:
	 sudo tcpdump -n -i eth0 "dst host 10.1.0.124 and dst port 162"
	 where IP address and port number are of the manager of managers.

	 Wireshark:
   Apply filter as: "ip.addr==192.168.1.1" and start capture on the required interface, can be eth0 or wlan0.
	 where "ip.addr" is the IP address of managers of managers.
