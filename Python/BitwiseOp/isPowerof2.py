class isPowerOf2(object):
    def isPowerOftwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n<=0:
            return False
        if n & n-1 ==0:
            return True
        else :
            return False
        