
package com.acme.acmepools.event;

import com.acme.acmepools.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Utilized to indicate when a job is created.
 * 
 * @author Juneau
 */
@Getter @Setter
@AllArgsConstructor
public class JobEvent {
    private String message;
    private Job job;
    
}
