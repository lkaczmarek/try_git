package try_git.test.services;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import try_git.services.SubService;

@Configuration
public class EmptyServiceTestMock {

	/**
	 * Create the SubService @Bean will add this bean into the spring repository.
	 * @return SubService
	 */
    @Bean
    public SubService createSubService(){
    	SubService mock=Mockito.mock(SubService.class);
    	Mockito.when(mock.calcPos(1, 1)).thenReturn(2);
        return mock;
    }
}
