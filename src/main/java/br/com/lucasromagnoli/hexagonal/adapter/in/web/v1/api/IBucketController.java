package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.api;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create.CreateBucketRequest;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateBucketResponse;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@RequestMapping("/v1/bucket")
public interface IBucketController {
    @PostMapping(
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    CreateBucketResponse create(@RequestBody CreateBucketRequest createBucketRequest);

    @GetMapping(
            value = "/{id}",
            produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    GetBucketResponse findById(@PathVariable String id);

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    List<GetBucketResponse> findAll();
}
