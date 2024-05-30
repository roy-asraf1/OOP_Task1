# Python Script Example: Write messages to console
# and log file both

import logging
import sys

# Log file location
logfile = '/temp/debug.log'
# Define the log format
log_format = (
    '[%(asctime)s] %(levelname)-8s %(name)-12s %(message)s')

# Define basic configuration
logging.basicConfig(
    # Define logging level
    level=logging.DEBUG,
    # Declare the object we created to format the log messages
    format=log_format,
    # Declare handlers
    handlers=[
        logging.FileHandler(logfile),
        logging.StreamHandler(sys.stdout),
    ]
)

# Define your own logger name
logger = logging.getLogger("my_logger")

# Write messages with all different types of levels
logger.debug('debug')
logger.info('info')
logger.warning('warning')
logger.error('error')
logger.critical('critical')