	// Add your code here

    Difference(int[] elements){
        this.elements = elements;
    }
    public int computeDifference(){
        for(int i=0; i<elements.length; i++){
            for(int j=i; j<elements.length; j++){
                maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
            }
        }
        return maximumDifference;
    }