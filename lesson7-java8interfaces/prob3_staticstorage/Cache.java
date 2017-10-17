package edu.mum.mpp.lesson7.prob3_staticstorage;

public interface Cache {
	//shouldn't be static
	default  public long timeout() {
		//seconds
		return 1;
	}
}
