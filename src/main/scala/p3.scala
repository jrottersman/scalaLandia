object p3 {
    
    def kthElement[A](k: Int, ls: List[A]): A = (k, ls) match {
        case (0, h :: _) => h
        case (k, _ :: tail) => kthElement(k - 1, tail)
        case (_, Nil) => throw new NoSuchElementException
        }
}
