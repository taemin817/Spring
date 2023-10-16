package com.acorn.inter;

import org.springframework.stereotype.Service;


@Service
public class GoogleApiTestImp implements GoogleApi{

	@Override
	public double[] 위도경도구하기() {
		
		return new double[] {34.4569, 129.3984};
	}
	
}
