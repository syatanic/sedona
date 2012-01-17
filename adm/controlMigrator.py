#! /usr/bin/env python
#
# controlMigrator.py
# 
#    Run the tool ControlKitMigrator
#
# Author:    Elizabeth McKenney
# Creation:  16 Jan 2012
#                 

import sys
import os
import subprocess
import optparse 

import tridiumenv
import jennicenv


#
# initParser
#   Initializes the options parser
#
def initParser():
  global parser

  parser = optparse.OptionParser(add_help_option=False, usage="""
  controlMigrator <app filename>
    
    Parses XML in <app filename> and converts any control components to
    the new kits in Sedona 1.2 .
""")

  parser.add_option("-h", "--help", action="help", 
                    help="Show this help message and exit")

  

#
# usage
#  Print usage (e.g. on error condition)
#
def usage():
  global parser

  # Just print the help generated by the parser for --help
  print ""
  parser.parse_args( ["--help"] )  



#
# Main
#
def main():
  global parser, options

  (options, args) = parser.parse_args()

  if not args or len(args)<1:
    usage()

  # Assemble command line
  cmd = "nre sedonac:sedonac.util.ControlKitMigrator \"" + args[0] + "\""

  # During development, print the full command line before executing
  print "\n\n   cmd = { " + cmd + " }  (" + str(len(cmd)) + ")\n\n"
  
  if subprocess.call(cmd, shell=True):
    raise Exception, "\n *** Failed:\n" + cmd


# 
# Main 
#
if __name__ == '__main__':

  # Initialize the options parser
  initParser()

  # Call the main function
  main()

