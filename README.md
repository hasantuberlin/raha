# Raha: A Configuration-Free Error Detection System
Detecting erroneous values is a key step in data cleaning.
Error detection algorithms usually require a user to provide input configurations in the form of integrity constraints or statistical parameters. However, providing a complete, yet correct, set of configurations for each new dataset is tedious and error-prone, as the user has to know about both the dataset and the error detection algorithms upfront.

Raha is a new configuration-free error detection system. The basic idea is that by generating a reasonably limited number of configurations for a set of error detection algorithms covering different types of data errors, we can generate an expressive feature vector for each entry in the dataset. Leveraging these feature vectors, we propose a novel sampling and classification approach that effectively chooses the most representative values for training. Furthermore, Raha can exploit  historical data, if available, to filter out irrelevant error detection algorithms and configurations.

## Installation
This project is implemented on top of [abstraction layer](https://github.com/BigDaMa/abstraction-layer).


## Content
### datasets
This folder contains input datasets.

### tools
This folder contains the underlying data cleaning tools.

### results
This folder contains the outputted results.

### dataset.py
This file contains the implementation of the dataset class.

### data_cleaning_tool.py
This file contains the implementation of the data cleaning tool class.

### raha.py
This file contains the implementation of the main application.

### raha.ipynb
This file demonstrates the system as a Jupyter notebook.