class CountiingBits(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        lis = []
        for i in range(0,num+1):
                c=0
                n = i
                while n:
                    c = c+1
                    n&= n-1
                lis.append(c)
        return lis
                    
                
        
        