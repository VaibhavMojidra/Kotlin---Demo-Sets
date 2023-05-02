fun main() {
	val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

	// Iteration with for loop
	for (num in numbers) {
		println(num)
	}

	// Iteration with forEach method
	numbers.forEach {
		println(it)
	}

	// Check if set contains element
	val containsFive = numbers.contains(5)
	println("Set contains 5: $containsFive")

	// Check if set is empty
	val isEmpty = numbers.isEmpty()
	println("Set is empty: $isEmpty")

	// Get size of set
	val size = numbers.size
	println("Set size: $size")

	// Add element to set
	val newSet = numbers.plus(11)
	println("New set with 11 added: $newSet")

	// Remove element from set
	val removedSet = numbers.minus(10)
	println("Set with 10 removed: $removedSet")

	// Intersection with another set
	val otherSet = setOf(2, 4, 6, 8, 10)
	val intersection = numbers.intersect(otherSet)
	println("Intersection with $otherSet: $intersection")

	// Union with another set
	val union = numbers.union(otherSet)
	println("Union with $otherSet: $union")

	// Check if all elements satisfy a condition
	val allGreaterThanZero = numbers.all { it > 0 }
	println("All greater than 0: $allGreaterThanZero")

	// Check if any element satisfies a condition
	val anyGreaterThanTen = numbers.any { it > 10 }
	println("Any greater than 10: $anyGreaterThanTen")
}
