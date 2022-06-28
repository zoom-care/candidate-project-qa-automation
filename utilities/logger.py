import logging

class Logger:
    def __init__(self):
        self._logger = logging.getLogger(__name__)
        self._c_handler = logging.StreamHandler()
        self._f_handler = logging.FileHandler('file.log')

    def set_level(self):
        self._c_handler.setLevel(logging.DEBUG)
        self._f_handler.setLevel(logging.ERROR)

    def set_formatter(self):
        _c_format = logging.Formatter('%(name)s - %(levelname)s - %(message)s')
        _f_format = logging.Formatter('%(asctime)s - %(name)s - %(levelname)s - %(message)s')
        self._c_handler.setFormatter(_c_format)
        self._f_handler.setFormatter(_f_format)

    def add_handlers(self):
        self._logger.addHandler(self._c_handler)
        self._logger.addHandler(self._f_handler)

    def init(self):
        self.set_level()
        self.set_formatter()
        self.add_handlers()
        return self._logger
