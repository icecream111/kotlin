package test

public interface TypeParamOfClassSubstituted {

    public interface Super<T> {
        public fun foo(): T

        public fun dummy() // to avoid loading as SAM interface
    }

    public interface Sub: Super<String> {
        override fun foo(): String
    }
}
