object p1 {
    
    def lastSelf[A](ls: List[A]): A = ls match {
        case h :: Nil=> h
        case _ :: tail => lastSelf(tail)
        case _         => throw new NoSuchElementException
        }
}
